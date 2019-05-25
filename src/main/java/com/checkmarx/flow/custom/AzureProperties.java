package com.checkmarx.flow.custom;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "azure")
@Validated
public class AzureProperties {
    private String webhookToken;
    private String token;
    private String url;
    private String apiUrl;
    private String issueType = "Issue";
    private String issueBody = "Description";
    private String appTagPrefix = "app";
    private String ownerTagPrefix = "owner";
    private String repoTagPrefix = "repo";
    private String branchLabelPrefix = "branch";
    private String apiVersion = "5.0";
    private String openStatus;
    private String closedStatus;
    private String falsePositiveLabel;

    public String getWebhookToken() {
        return this.webhookToken;
    }

    public String getToken() {
        return this.token;
    }

    public String getUrl() {
        return this.url;
    }

    public String getApiUrl() {
        return this.apiUrl;
    }

    public String getFalsePositiveLabel() {
        return this.falsePositiveLabel;
    }

    public void setWebhookToken(String webhookToken) {
        this.webhookToken = webhookToken;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public void setFalsePositiveLabel(String falsePositiveLabel) {
        this.falsePositiveLabel = falsePositiveLabel;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getIssueBody() {
        return issueBody;
    }

    public void setIssueBody(String issueBody) {
        this.issueBody = issueBody;
    }

    public String getAppTagPrefix() {
        return appTagPrefix;
    }

    public void setAppTagPrefix(String appTagPrefix) {
        this.appTagPrefix = appTagPrefix;
    }

    public String getOwnerTagPrefix() {
        return ownerTagPrefix;
    }

    public void setOwnerTagPrefix(String ownerTagPrefix) {
        this.ownerTagPrefix = ownerTagPrefix;
    }

    public String getRepoTagPrefix() {
        return repoTagPrefix;
    }

    public void setRepoTagPrefix(String repoTagPrefix) {
        this.repoTagPrefix = repoTagPrefix;
    }

    public String getBranchLabelPrefix() {
        return branchLabelPrefix;
    }

    public void setBranchLabelPrefix(String branchLabelPrefix) {
        this.branchLabelPrefix = branchLabelPrefix;
    }

    public String getOpenStatus() {
        return openStatus;
    }

    public void setOpenStatus(String openStatus) {
        this.openStatus = openStatus;
    }

    public String getClosedStatus() {
        return closedStatus;
    }

    public void setClosedStatus(String closedStatus) {
        this.closedStatus = closedStatus;
    }
}
