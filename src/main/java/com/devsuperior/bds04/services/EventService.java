package com.devsuperior.bds04.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.bds04.dto.EventDTO;
import com.devsuperior.bds04.entities.City;
import com.devsuperior.bds04.entities.Event;
import com.devsuperior.bds04.repositories.EventRepository;

@Service
public class EventService {

	@Autowired
	private EventRepository eventRepository;
	
	@Transactional(readOnly = true)
	public Page<EventDTO> findAllPagedEvents(Pageable pageable){
		Page<Event> events = eventRepository.findAll(pageable);
		return events.map(event -> new EventDTO(event));
	}
	
	
	@Transactional
	public EventDTO insertEvent(EventDTO eventDTO) {
		Event event = new Event();
		event.setDate(LocalDate.now());
		copyEventDtoToEventEntity(eventDTO, event);
		event = eventRepository.save(event);
		
		return new EventDTO(event);
	}
	
	
	private void copyEventDtoToEventEntity(EventDTO eventDTO, Event event) {
		event.setName(eventDTO.getName());
		event.setUrl(eventDTO.getUrl());
		event.setCity(new City(eventDTO.getCityId(), null));
	}
	
	
}
