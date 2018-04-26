package com.rivancic.swagger.api.controller;

import com.rivancic.swagger.api.model.TestResponse;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-26T21:41:22.004+02:00")

@Controller
public class TestApiController implements TestApi {



    public ResponseEntity<TestResponse> testGet(@ApiParam(value = "required \"path\" path parameter",required=true ) @PathVariable("path") String path,
         @ApiParam(value = "optional \"query\" query parameter") @RequestParam(value = "query", required = false) String query,
        @ApiParam(value = "Optional custom header"  ) @RequestHeader(value="X-Rivancic-Header", required=false) String xRivancicHeader) {
        // do some magic!
        return new ResponseEntity<TestResponse>(HttpStatus.OK);
    }

}
