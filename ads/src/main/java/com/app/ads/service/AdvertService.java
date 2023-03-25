package com.app.ads.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@AllArgsConstructor
@Service
public class AdvertService {
	private static final String SEARCH_QUERY_TOPIC = "${topic.name1}";


	@KafkaListener(topics = SEARCH_QUERY_TOPIC)
	public void applyAdsByKeyword(String message) {
		// some logic

		log.info("Advert applied. Keyword: {}", message);
	}

	@KafkaListener(topics = SEARCH_QUERY_TOPIC)
	public void applyAdsForRegularClient() {
		// some logic

		log.info("Subscription ads applied");
	}
}
