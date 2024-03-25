

# DashboardGadget

Details of a gadget.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title of the gadget. |  [readonly] |
|**color** | [**ColorEnum**](#ColorEnum) | The color of the gadget. Should be one of &#x60;blue&#x60;, &#x60;red&#x60;, &#x60;yellow&#x60;, &#x60;green&#x60;, &#x60;cyan&#x60;, &#x60;purple&#x60;, &#x60;gray&#x60;, or &#x60;white&#x60;. |  [readonly] |
|**id** | **Long** | The ID of the gadget instance. |  [readonly] |
|**moduleKey** | **String** | The module key of the gadget type. |  [optional] [readonly] |
|**position** | [**DashboardGadgetPosition**](DashboardGadgetPosition.md) | The position of the gadget. |  |
|**uri** | **String** | The URI of the gadget type. |  [optional] [readonly] |



## Enum: ColorEnum

| Name | Value |
|---- | -----|
| BLUE | &quot;blue&quot; |
| RED | &quot;red&quot; |
| YELLOW | &quot;yellow&quot; |
| GREEN | &quot;green&quot; |
| CYAN | &quot;cyan&quot; |
| PURPLE | &quot;purple&quot; |
| GRAY | &quot;gray&quot; |
| WHITE | &quot;white&quot; |



