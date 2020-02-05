package demo.core.model;

import java.time.Instant;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NonNull;

@Data
public class ExceptionDto {

	@NonNull
	@NotNull
	@NotEmpty
	@Schema(description = "The date and time the problem occured", example = "2020-02-04T13:21:08.098+0000", type = "string", format = "date-time")
	private Instant timestamp;

	@Schema(description = "The exception class", example = "com.it4it.it4data.newdata.dataplatform.portal.api.core.exception.BadArgumentException")
	private String exception;

	@Schema(description = "The exception message", example = "Trying to update a non existing component !")
	private String message;

}
