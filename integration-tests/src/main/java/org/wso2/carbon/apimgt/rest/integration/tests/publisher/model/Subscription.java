/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.rest.integration.tests.publisher.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.Objects;

/**
 * Subscription
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-07T02:17:03.896Z")
public class Subscription {
  @SerializedName("subscriptionId")
  private String subscriptionId = null;

  @SerializedName("applicationInfo")
  private Application applicationInfo = null;

  @SerializedName("policy")
  private String policy = null;

  /**
   * Gets or Sets subscriptionStatus
   */
  @JsonAdapter(SubscriptionStatusEnum.Adapter.class)
  public enum SubscriptionStatusEnum {
    BLOCKED("BLOCKED"),

    PROD_ONLY_BLOCKED("PROD_ONLY_BLOCKED"),

    SANDBOX_ONLY_BLOCKED("SANDBOX_ONLY_BLOCKED"),

    ACTIVE("ACTIVE"),

    ON_HOLD("ON_HOLD"),

    REJECTED("REJECTED");

    private String value;

    SubscriptionStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubscriptionStatusEnum fromValue(String text) {
      for (SubscriptionStatusEnum b : SubscriptionStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SubscriptionStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubscriptionStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubscriptionStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SubscriptionStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("subscriptionStatus")
  private SubscriptionStatusEnum subscriptionStatus = null;

  public Subscription subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Get subscriptionId
   * @return subscriptionId
  **/
  @ApiModelProperty(example = "01234567-0123-0123-0123-012345678901", required = true, value = "")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public Subscription applicationInfo(Application applicationInfo) {
    this.applicationInfo = applicationInfo;
    return this;
  }

   /**
   * Get applicationInfo
   * @return applicationInfo
  **/
  @ApiModelProperty(required = true, value = "")
  public Application getApplicationInfo() {
    return applicationInfo;
  }

  public void setApplicationInfo(Application applicationInfo) {
    this.applicationInfo = applicationInfo;
  }

  public Subscription policy(String policy) {
    this.policy = policy;
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  @ApiModelProperty(example = "Unlimited", required = true, value = "")
  public String getPolicy() {
    return policy;
  }

  public void setPolicy(String policy) {
    this.policy = policy;
  }

  public Subscription subscriptionStatus(SubscriptionStatusEnum subscriptionStatus) {
    this.subscriptionStatus = subscriptionStatus;
    return this;
  }

   /**
   * Get subscriptionStatus
   * @return subscriptionStatus
  **/
  @ApiModelProperty(example = "BLOCKED", required = true, value = "")
  public SubscriptionStatusEnum getSubscriptionStatus() {
    return subscriptionStatus;
  }

  public void setSubscriptionStatus(SubscriptionStatusEnum subscriptionStatus) {
    this.subscriptionStatus = subscriptionStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.subscriptionId, subscription.subscriptionId) &&
        Objects.equals(this.applicationInfo, subscription.applicationInfo) &&
        Objects.equals(this.policy, subscription.policy) &&
        Objects.equals(this.subscriptionStatus, subscription.subscriptionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, applicationInfo, policy, subscriptionStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    applicationInfo: ").append(toIndentedString(applicationInfo)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    subscriptionStatus: ").append(toIndentedString(subscriptionStatus)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

