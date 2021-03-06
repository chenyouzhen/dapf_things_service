package com.siemens.ct.sz.dd.thingsservice.service;

import com.siemens.ct.sz.dd.thingsservice.service.dto.AlarmDTO;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link com.siemens.ct.sz.dd.thingsservice.domain.Alarm}.
 */
public interface AlarmService {

    /**
     * Save a alarm.
     *
     * @param alarmDTO the entity to save.
     * @return the persisted entity.
     */
    AlarmDTO save(AlarmDTO alarmDTO);

    /**
     * Get all the alarms.
     *
     * @return the list of entities.
     */
    List<AlarmDTO> findAll();

    /**
     * Get the "id" alarm.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<AlarmDTO> findOne(Long id);

    /**
     * Delete the "id" alarm.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
