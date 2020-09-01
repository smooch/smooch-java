/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 5.29
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.api;

import io.smooch.client.ApiCallback;
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.ApiResponse;
import io.smooch.client.Configuration;
import io.smooch.client.Pair;
import io.smooch.client.ProgressRequestBody;
import io.smooch.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.smooch.client.model.NotificationPost;
import io.smooch.client.model.NotificationResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationApi {
    private ApiClient apiClient;

    public NotificationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NotificationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for postNotification
     * @param appId Identifies the app. (required)
     * @param notificationPostBody Body for a postNotification request.  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postNotificationCall(String appId, NotificationPost notificationPostBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = notificationPostBody;
        
        // create path and map variables
        String localVarPath = "/v1/apps/{appId}/notifications"
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth", "jwt" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postNotificationValidateBeforeCall(String appId, NotificationPost notificationPostBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling postNotification(Async)");
        }
        
        // verify the required parameter 'notificationPostBody' is set
        if (notificationPostBody == null) {
            throw new ApiException("Missing the required parameter 'notificationPostBody' when calling postNotification(Async)");
        }
        
        
        com.squareup.okhttp.Call call = postNotificationCall(appId, notificationPostBody, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Post a notification to an externalId.
     * @param appId Identifies the app. (required)
     * @param notificationPostBody Body for a postNotification request.  (required)
     * @return NotificationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public NotificationResponse postNotification(String appId, NotificationPost notificationPostBody) throws ApiException {
        ApiResponse<NotificationResponse> resp = postNotificationWithHttpInfo(appId, notificationPostBody);
        return resp.getData();
    }

    /**
     * 
     * Post a notification to an externalId.
     * @param appId Identifies the app. (required)
     * @param notificationPostBody Body for a postNotification request.  (required)
     * @return ApiResponse&lt;NotificationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<NotificationResponse> postNotificationWithHttpInfo(String appId, NotificationPost notificationPostBody) throws ApiException {
        com.squareup.okhttp.Call call = postNotificationValidateBeforeCall(appId, notificationPostBody, null, null);
        Type localVarReturnType = new TypeToken<NotificationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Post a notification to an externalId.
     * @param appId Identifies the app. (required)
     * @param notificationPostBody Body for a postNotification request.  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postNotificationAsync(String appId, NotificationPost notificationPostBody, final ApiCallback<NotificationResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postNotificationValidateBeforeCall(appId, notificationPostBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<NotificationResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
