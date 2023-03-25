package com.github.pedroluiznogueira.producer.domain.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class SearchQueryDto {

	String query;

	private Date data;
}
