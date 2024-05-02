/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.telnyx.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.model.DocServiceDocumentUploadInline;
import com.telnyx.sdk.model.DocServiceDocumentUploadURL;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.telnyx.sdk.JSON;

import com.fasterxml.jackson.core.type.TypeReference;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.telnyx.sdk.JSON;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
@JsonDeserialize(using = CreateDocServiceDocumentRequest.CreateDocServiceDocumentRequestDeserializer.class)
@JsonSerialize(using = CreateDocServiceDocumentRequest.CreateDocServiceDocumentRequestSerializer.class)
public class CreateDocServiceDocumentRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateDocServiceDocumentRequest.class.getName());

    public static class CreateDocServiceDocumentRequestSerializer extends StdSerializer<CreateDocServiceDocumentRequest> {
        public CreateDocServiceDocumentRequestSerializer(Class<CreateDocServiceDocumentRequest> t) {
            super(t);
        }

        public CreateDocServiceDocumentRequestSerializer() {
            this(null);
        }

        @Override
        public void serialize(CreateDocServiceDocumentRequest value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class CreateDocServiceDocumentRequestDeserializer extends StdDeserializer<CreateDocServiceDocumentRequest> {
        public CreateDocServiceDocumentRequestDeserializer() {
            this(CreateDocServiceDocumentRequest.class);
        }

        public CreateDocServiceDocumentRequestDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public CreateDocServiceDocumentRequest deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize DocServiceDocumentUploadInline
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (DocServiceDocumentUploadInline.class.equals(Integer.class) || DocServiceDocumentUploadInline.class.equals(Long.class) || DocServiceDocumentUploadInline.class.equals(Float.class) || DocServiceDocumentUploadInline.class.equals(Double.class) || DocServiceDocumentUploadInline.class.equals(Boolean.class) || DocServiceDocumentUploadInline.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((DocServiceDocumentUploadInline.class.equals(Integer.class) || DocServiceDocumentUploadInline.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((DocServiceDocumentUploadInline.class.equals(Float.class) || DocServiceDocumentUploadInline.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (DocServiceDocumentUploadInline.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (DocServiceDocumentUploadInline.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(DocServiceDocumentUploadInline.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'DocServiceDocumentUploadInline'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'DocServiceDocumentUploadInline'", e);
            }

            // deserialize DocServiceDocumentUploadURL
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (DocServiceDocumentUploadURL.class.equals(Integer.class) || DocServiceDocumentUploadURL.class.equals(Long.class) || DocServiceDocumentUploadURL.class.equals(Float.class) || DocServiceDocumentUploadURL.class.equals(Double.class) || DocServiceDocumentUploadURL.class.equals(Boolean.class) || DocServiceDocumentUploadURL.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((DocServiceDocumentUploadURL.class.equals(Integer.class) || DocServiceDocumentUploadURL.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((DocServiceDocumentUploadURL.class.equals(Float.class) || DocServiceDocumentUploadURL.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (DocServiceDocumentUploadURL.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (DocServiceDocumentUploadURL.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(DocServiceDocumentUploadURL.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'DocServiceDocumentUploadURL'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'DocServiceDocumentUploadURL'", e);
            }

            if (match == 1) {
                CreateDocServiceDocumentRequest ret = new CreateDocServiceDocumentRequest();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for CreateDocServiceDocumentRequest: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public CreateDocServiceDocumentRequest getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "CreateDocServiceDocumentRequest cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public CreateDocServiceDocumentRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateDocServiceDocumentRequest(DocServiceDocumentUploadInline o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateDocServiceDocumentRequest(DocServiceDocumentUploadURL o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("DocServiceDocumentUploadInline", new GenericType<DocServiceDocumentUploadInline>() {
        });
        schemas.put("DocServiceDocumentUploadURL", new GenericType<DocServiceDocumentUploadURL>() {
        });
        JSON.registerDescendants(CreateDocServiceDocumentRequest.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return CreateDocServiceDocumentRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * DocServiceDocumentUploadInline, DocServiceDocumentUploadURL
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(DocServiceDocumentUploadInline.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(DocServiceDocumentUploadURL.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be DocServiceDocumentUploadInline, DocServiceDocumentUploadURL");
    }

    /**
     * Get the actual instance, which can be the following:
     * DocServiceDocumentUploadInline, DocServiceDocumentUploadURL
     *
     * @return The actual instance (DocServiceDocumentUploadInline, DocServiceDocumentUploadURL)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `DocServiceDocumentUploadInline`. If the actual instance is not `DocServiceDocumentUploadInline`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DocServiceDocumentUploadInline`
     * @throws ClassCastException if the instance is not `DocServiceDocumentUploadInline`
     */
    public DocServiceDocumentUploadInline getDocServiceDocumentUploadInline() throws ClassCastException {
        return (DocServiceDocumentUploadInline)super.getActualInstance();
    }

    /**
     * Get the actual instance of `DocServiceDocumentUploadURL`. If the actual instance is not `DocServiceDocumentUploadURL`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DocServiceDocumentUploadURL`
     * @throws ClassCastException if the instance is not `DocServiceDocumentUploadURL`
     */
    public DocServiceDocumentUploadURL getDocServiceDocumentUploadURL() throws ClassCastException {
        return (DocServiceDocumentUploadURL)super.getActualInstance();
    }

}

