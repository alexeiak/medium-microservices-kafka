package com.app.search.service;

import com.app.search.domain.dto.SearchQueryDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
