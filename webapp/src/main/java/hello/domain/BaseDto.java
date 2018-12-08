package hello.domain;

import hello.model.BaseEntity;

public interface BaseDto<E extends BaseEntity> {

     BaseDto mapFromEntity(E entity);
     E mapToEntity();
}
