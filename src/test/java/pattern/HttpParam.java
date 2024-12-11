package pattern;

import java.util.HashMap;
import java.util.Map;

public class HttpParam {

    Map<String, String> headerParams = new HashMap<>();
    Map<String, String> queryParams = new HashMap<>();
    Map<String,String> pathParams = new HashMap<>();
    String bodyParams;

    public HttpParam(Builder builder){

        this.headerParams = builder.headerParams;
        this.bodyParams = builder.bodyParams;
        this.pathParams = builder.pathParams;
        this.queryParams = builder.queryParams;
    }

    //Getters method

    public Map<String, String> getHeaderParams(){

        return headerParams;
    }

    public Map<String, String> getQueryParams(){
        return queryParams;
    }

    public Map<String, String> getPathParams(){
        return pathParams;
    }
    public String getBodyParams(){
        return bodyParams;
    }

    static class  Builder{
        Map<String, String> headerParams = new HashMap<>();
        Map<String, String> queryParams = new HashMap<>();
        Map<String,String> pathParams = new HashMap<>();
        String bodyParams;

        public Builder addQueryParam(String key, String value) {
            this.queryParams.put(key, value);
            return this;
        }

        // Method to add path parameters
        public Builder addPathParam(String key, String value) {
            this.pathParams.put(key, value);
            return this;
        }

        // Method to add header parameters
        public Builder addHeaderParam(String key, String value) {
            this.headerParams.put(key, value);
            return this;
        }

        // Method to set the body
        public Builder setBody(String body) {
            this.bodyParams = body;
            return this;
        }
        // Build method to create HttpParam object
        public HttpParam build() {
            return new HttpParam(this);
        }
    }
    @Override
    public String toString() {
        return "HttpParam{" +
                "queryParams=" + queryParams +
                ", pathParams=" + pathParams +
                ", headerParams=" + headerParams +
                ", body='" + bodyParams + '\'' +
                '}';
    }
    public static void main(String[] args) {
        // Creating an instance of HttpParam using the Builder
        HttpParam httpParam = new HttpParam.Builder()
                .addQueryParam("search", "java")
                .addQueryParam("page", "1")
                .addPathParam("userId", "123")
                .addHeaderParam("Authorization", "Bearer token123")
                .setBody("{\"key\": \"value\"}")
                .build();

        // Printing the created HttpParam object
        System.out.println(httpParam);

        // Accessing specific components of HttpParam
        System.out.println("Query Params: " + httpParam.getQueryParams());
        System.out.println("Path Params: " + httpParam.getPathParams());
        System.out.println("Header Params: " + httpParam.getHeaderParams());
        System.out.println("Body: " + httpParam.getBodyParams());
    }
}
