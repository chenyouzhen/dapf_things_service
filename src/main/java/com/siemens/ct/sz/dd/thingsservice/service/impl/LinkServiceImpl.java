package com.siemens.ct.sz.dd.thingsservice.service.impl;

import com.siemens.ct.sz.dd.thingsservice.service.LinkService;
import com.siemens.ct.sz.dd.thingsservice.domain.Link;
import com.siemens.ct.sz.dd.thingsservice.repository.LinkRepository;
import com.siemens.ct.sz.dd.thingsservice.service.dto.LinkDTO;
import com.siemens.ct.sz.dd.thingsservice.service.mapper.LinkMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Service Implementation for managing {@link Link}.
 */
@Service
@Transactional
public class LinkServiceImpl implements LinkService {

    private final Logger log = LoggerFactory.getLogger(LinkServiceImpl.class);

    private final LinkRepository linkRepository;

    private final LinkMapper linkMapper;

    public LinkServiceImpl(LinkRepository linkRepository, LinkMapper linkMapper) {
        this.linkRepository = linkRepository;
        this.linkMapper = linkMapper;
    }

    /**
     * Save a link.
     *
     * @param linkDTO the entity to save.
     * @return the persisted entity.
     */
    @Override
    public LinkDTO save(LinkDTO linkDTO) {
        log.debug("Request to save Link : {}", linkDTO);
        Link link = linkMapper.toEntity(linkDTO);
        link = linkRepository.save(link);
        return linkMapper.toDto(link);
    }

    /**
     * Get all the links.
     *
     * @return the list of entities.
     */
    @Override
    @Transactional(readOnly = true)
    public List<LinkDTO> findAll() {
        log.debug("Request to get all Links");
        return linkRepository.findAll().stream()
            .map(linkMapper::toDto)
            .collect(Collectors.toCollection(LinkedList::new));
    }

    /**
     * Get one link by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<LinkDTO> findOne(Long id) {
        log.debug("Request to get Link : {}", id);
        return linkRepository.findById(id)
            .map(linkMapper::toDto);
    }

    /**
     * Delete the link by id.
     *
     * @param id the id of the entity.
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Link : {}", id);
        linkRepository.deleteById(id);
    }
}
