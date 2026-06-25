

# WhatsappGroupJoinRequestActionResponse

Result of approving or rejecting group join requests.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**approvedJoinRequests** | **List&lt;String&gt;** | Approved join request IDs. |  [optional] |
|**rejectedJoinRequests** | **List&lt;String&gt;** | Rejected join request IDs. |  [optional] |
|**failedJoinRequests** | [**List&lt;WhatsappGroupFailedJoinRequest&gt;**](WhatsappGroupFailedJoinRequest.md) | Join requests that failed to be processed. |  [optional] |
|**errors** | **List&lt;Map&lt;String, Object&gt;&gt;** | Errors returned by WhatsApp. |  [optional] |



