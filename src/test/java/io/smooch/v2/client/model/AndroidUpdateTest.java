/*
 * Sunshine Conversations API
 * #  <aside class=\"notice\">As a stepping stone to new and greater things, we’ve released an update to the SunCo API, which is v2. For users wanting to access v1, please proceed <a href=\"https://docs.smooch.io/rest/\">here</a>.  </aside>  # Introduction  Welcome to the Sunshine Conversations API. The API allows you to craft entirely unique messaging experiences for your app and website as well as talk to any backend or external service.  The Sunshine Conversations API is designed according to REST principles. The API accepts JSON in request bodies and requires that the content-type: application/json header be specified for  all such requests. The API will always respond with an object. Depending on context, resources may be returned as single objects or as arrays of objects, nested within the response object.  In some cases, the API will also facilitate cross-origin resource sharing so that it can be called from a web application.  <aside class=\"notice\">Note that for authenticated requests, cross-origin resource sharing is only available to appUser scoped credentials. Attempting to call the API from the browser using  app or account scoped credentials will result in a <a href=\"https://developer.mozilla.org/en-US/docs/Web/Security/Same-origin_policy\">same-origin policy</a> browser error. For more information, refer  to the <a href=\"http://docs.smooch.io/guide/authorization/#handle-credentials-with-caution\">Authorization guide</a>.</aside>  ## API pagination and records limits  Some APIs can be paginated by providing the offset query string parameter. The offset is the number of initial records to skip before picking records to return. Default 0. The limit query string can also be provided to change the number of records to return (maximum 100, default 25)    Sunshine Conversations is available in the following regions. Each Sunshine Conversations region has its own API host.  ## Regions  | Region         | Host                       | | -------------- | -------------------------- | | United States  | https://api.smooch.io      | | European Union | https://api.eu-1.smooch.io |    For more information on regions, visit [the guide](/guide/regions/).    <aside class=\"notice\">When configuring an API host, make sure to always use `https`. Some API clients can have unexpected behaviour when following redirects from `http` to `https`.</aside> 
 *
 * The version of the OpenAPI document: 6.0.0-alpha
 * Contact: hello@smooch.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.smooch.v2.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.smooch.v2.client.model.AndroidAllOf;
import io.smooch.v2.client.model.IntegrationUpdateBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for AndroidUpdate
 */
public class AndroidUpdateTest {
    private final AndroidUpdate model = new AndroidUpdate();

    /**
     * Model tests for AndroidUpdate
     */
    @Test
    public void testAndroidUpdate() {
        // TODO: test AndroidUpdate
    }

    /**
     * Test the property 'displayName'
     */
    @Test
    public void displayNameTest() {
        // TODO: test displayName
    }

    /**
     * Test the property 'serverKey'
     */
    @Test
    public void serverKeyTest() {
        // TODO: test serverKey
    }

    /**
     * Test the property 'senderId'
     */
    @Test
    public void senderIdTest() {
        // TODO: test senderId
    }

    /**
     * Test the property 'canUserCreateConversation'
     */
    @Test
    public void canUserCreateConversationTest() {
        // TODO: test canUserCreateConversation
    }

}
