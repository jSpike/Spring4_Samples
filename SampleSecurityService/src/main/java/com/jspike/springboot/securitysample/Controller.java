/**
 * 
 */
package com.jspike.springboot.securitysample;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author hariram
 *
 */
@RestController
public class Controller {
	@RequestMapping(method=RequestMethod.GET, value="/get")
	public String get(@RequestParam(defaultValue="unknown", value="name", required=false) String name) { 
		return "Hello " + name;
	}
}
