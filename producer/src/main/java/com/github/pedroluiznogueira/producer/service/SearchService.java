package com.github.pedroluiznogueira.producer.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pedroluiznogueira.producer.domain.dto.SearchQueryDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@AllArgsConstructor
@Service
public class SearchService {

	public void executeForSearchResult(SearchQueryDto searchQueryDto) {
		// some logic

		log.info("Search query handled: {}", searchQueryDto.getQuery());
	}
}
