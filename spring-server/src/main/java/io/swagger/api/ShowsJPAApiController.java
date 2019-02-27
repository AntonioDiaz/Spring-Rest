package io.swagger.api;

import io.swagger.model.ErrorResponse;
import io.swagger.model.Show;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-27T11:21:23.367Z")

@Controller
public class ShowsJPAApiController implements ShowsApi {

    private static final Logger log = LoggerFactory.getLogger(ShowsJPAApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ShowsJPAApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> createShow(@ApiParam(value = "Here is the show data required to create a show" ,required=true )  @Valid @RequestBody Show body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Show> getShow(@ApiParam(value = "",required=true) @PathVariable("id_show") Integer idShow) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Show>(objectMapper.readValue("{  \"id\" : 666,  \"location\" : \"Gijon\",  \"ticketsAvailable\" : 999,  \"endSellingDate\" : \"2018-12-12T00:00:00Z\",  \"startSellingDate\" : \"2019-04-04T00:00:00Z\",  \"name\" : \"Gijon Sound\",  \"price\" : 50,  \"showType\" : \"MUSIC\"}", Show.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Show>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Show>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Show>> getShows() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Show>>(objectMapper.readValue("[ {  \"price\" : 1.4658129805029452,  \"name\" : \"sonar\",  \"showType\" : \"MUSIC\",  \"location\" : \"Barcelona\",  \"ticketsAvailable\" : 6,  \"id\" : 0,  \"startSellingDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"endSellingDate\" : \"2000-01-23T04:56:07.000+00:00\"}, {  \"price\" : 1.4658129805029452,  \"name\" : \"sonar\",  \"showType\" : \"MUSIC\",  \"location\" : \"Barcelona\",  \"ticketsAvailable\" : 6,  \"id\" : 0,  \"startSellingDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"endSellingDate\" : \"2000-01-23T04:56:07.000+00:00\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Show>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Show>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Show> showsIdShowDelete(@ApiParam(value = "",required=true) @PathVariable("id_show") Integer idShow) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Show>(objectMapper.readValue("{  \"price\" : 1.4658129805029452,  \"name\" : \"sonar\",  \"showType\" : \"MUSIC\",  \"location\" : \"Barcelona\",  \"ticketsAvailable\" : 6,  \"id\" : 0,  \"startSellingDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"endSellingDate\" : \"2000-01-23T04:56:07.000+00:00\"}", Show.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Show>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Show>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> showsIdShowPut(@ApiParam(value = "",required=true) @PathVariable("id_show") Integer idShow,@ApiParam(value = "data show to edit" ,required=true )  @Valid @RequestBody Show body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
