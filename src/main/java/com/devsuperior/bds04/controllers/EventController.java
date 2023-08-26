package com.devsuperior.bds04.controllers;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.devsuperior.bds04.dto.EventDTO;
import com.devsuperior.bds04.services.EventService;

@RestController
@RequestMapping(value = "/events")
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@GetMapping
	public ResponseEntity<Page<EventDTO>> findAllEvent(Pageable pageable){
		PageRequest pageRequest = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize());
		Page<EventDTO> events = eventService.findAllPagedEvents(pageRequest);
		
		return ResponseEntity.ok().body(events);
	}
	
	@PostMapping
	public ResponseEntity<EventDTO> insertEvent(@RequestBody @Valid EventDTO eventDto){
		eventDto = eventService.insertEvent(eventDto);
		
		URI uri = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(eventDto.getId()).toUri();
		
		return ResponseEntity.created(uri).body(eventDto);
	}

}
