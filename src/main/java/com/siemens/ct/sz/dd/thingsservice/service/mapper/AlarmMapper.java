package com.siemens.ct.sz.dd.thingsservice.service.mapper;


import com.siemens.ct.sz.dd.thingsservice.domain.*;
import com.siemens.ct.sz.dd.thingsservice.service.dto.AlarmDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Alarm} and its DTO {@link AlarmDTO}.
 */
@Mapper(componentModel = "spring", uses = {FactoryMapper.class})
public interface AlarmMapper extends EntityMapper<AlarmDTO, Alarm> {

    @Mapping(source = "factory.id", target = "factoryId")
    @Mapping(source = "factory.name", target = "factoryName")
    AlarmDTO toDto(Alarm alarm);

    @Mapping(source = "factoryId", target = "factory")
    Alarm toEntity(AlarmDTO alarmDTO);

    default Alarm fromId(Long id) {
        if (id == null) {
            return null;
        }
        Alarm alarm = new Alarm();
        alarm.setId(id);
        return alarm;
    }
}
