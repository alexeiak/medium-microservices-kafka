package com.github.pedroluiznogueira.producer.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.pedroluiznogueira.producer.domain.dto.SearchQueryDto;
import com.github.pedroluiznogueira.producer.service.SearchService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/")
public class SearchController {

    private final SearchService searchService;

	private final KafkaTemplate<String, Object> kafkaTemplate;

	private static final String USER_DATA_TOPIC = "user_data";
	private static final String SEARCH_QUERY_TOPIC = "search_query";


    @PostMapping
    public String searchHandling(@RequestBody SearchQueryDto searchQueryDto) {
	    searchService.executeForSearchResult(searchQueryDto);

	    kafkaTemplate.send(USER_DATA_TOPIC, searchQueryDto);

	    return "message sent";
    }
}
