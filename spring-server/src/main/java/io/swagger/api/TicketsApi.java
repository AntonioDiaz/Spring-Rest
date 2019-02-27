/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.2).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ErrorResponse;
import io.swagger.model.Ticket;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-27T11:21:23.367Z")

@Api(value = "tickets", description = "the tickets API")
public interface TicketsApi {

    @ApiOperation(value = "Here you can buy tickets for an event/show", nickname = "buyTickets", notes = "We asume that the bought of a tiket implies the payment of that", tags={ "Tickets", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Ticket purchase has been done"),
        @ApiResponse(code = 404, message = "Show not found", response = ErrorResponse.class),
        @ApiResponse(code = 500, message = "Error response", response = ErrorResponse.class) })
    @RequestMapping(value = "/tickets/{id_show}/buy",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> buyTickets(@ApiParam(value = "",required=true) @PathVariable("id_show") Integer idShow,@ApiParam(value = "Order to buy one or more tickets for a valid show" ,required=true )  @Valid @RequestBody Ticket body);

}
