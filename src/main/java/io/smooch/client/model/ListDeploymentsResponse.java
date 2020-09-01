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


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.smooch.client.model.Deployment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ListDeploymentsResponse
 */

public class ListDeploymentsResponse {
  @SerializedName("deployments")
  private List<Deployment> deployments = new ArrayList<Deployment>();

  public ListDeploymentsResponse deployments(List<Deployment> deployments) {
    this.deployments = deployments;
    return this;
  }

  public ListDeploymentsResponse addDeploymentsItem(Deployment deploymentsItem) {
    this.deployments.add(deploymentsItem);
    return this;
  }

   /**
   * The list of deployments.
   * @return deployments
  **/
  @ApiModelProperty(required = true, value = "The list of deployments.")
  public List<Deployment> getDeployments() {
    return deployments;
  }

  public void setDeployments(List<Deployment> deployments) {
    this.deployments = deployments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDeploymentsResponse listDeploymentsResponse = (ListDeploymentsResponse) o;
    return Objects.equals(this.deployments, listDeploymentsResponse.deployments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDeploymentsResponse {\n");
    
    sb.append("    deployments: ").append(toIndentedString(deployments)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

