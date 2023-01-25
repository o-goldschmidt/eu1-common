package com.eu1.domain.event.publisher;

import com.eu1.domain.event.DomainEvent;

public interface DomainEventPublisher <T extends DomainEvent>{

    void publish(T domainEvent);
}
