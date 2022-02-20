package es.iestetuan.ngg.JSON;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ColorJSON {

	 @JsonProperty("codigo_color_json")
	 private int codigocolor;
	 @JsonProperty("nombre_json")
	 private String nombre;
	 @JsonProperty("codigo_hexadecimal_json")
	 private String codhexadecimal;
}
