package com.nt.client_comp;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("FeignClient-Producer")
public interface IFeignClientComponent {
   
  @GetMapping("/customer-api/message/{name}")
  public  ResponseEntity<String> retriveMessage( @PathVariable("name") String customerName);
}
