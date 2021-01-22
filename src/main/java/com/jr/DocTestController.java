package com.jr;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Part;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.multipart.CompletedFileUpload;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@Controller
public class DocTestController {

    @Operation(
        summary = "summary",
        description = "description",
        responses = @ApiResponse(
            responseCode = "201",
            description = "it was created"
        )
    )
    @Post(consumes = MediaType.MULTIPART_FORM_DATA)
    public HttpResponse<String> postMultipartForm(@Part("part")CompletedFileUpload completedFileUpload) {
        return HttpResponse.created("You did it!");
    }
}