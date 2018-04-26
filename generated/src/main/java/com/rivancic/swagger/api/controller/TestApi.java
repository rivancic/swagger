package com.rivancic.swagger.api.controller;

import com.rivancic.swagger.api.model.TestResponse;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-26T21:41:22.004+02:00")

@Api(value = "test", description = "the test API")
public interface TestApi {

    @ApiOperation(value = "Returns test response", notes = "Test method. It will always return test response. ", response = TestResponse.class, tags={ "swagger-api", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Test response", response = TestResponse.class) })
    @RequestMapping(value = "/test",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<TestResponse> testGet(@ApiParam(value = "required \"path\" path parameter",required=true ) @PathVariable("path") String path,
         @ApiParam(value = "optional \"query\" query parameter") @RequestParam(value = "query", required = false) String query,
        @ApiParam(value = "Optional custom header"  ) @RequestHeader(value="X-Rivancic-Header", required=false) String xRivancicHeader);

}
