# CreateTexmlApplicationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**friendlyName** | **String** |  | 
**active** | **Boolean** |  |  [optional]
**anchorsiteOverride** | [**AnchorsiteOverride**](AnchorsiteOverride.md) |  |  [optional]
**dtmfType** | [**DtmfType**](DtmfType.md) |  |  [optional]
**firstCommandTimeout** | **Boolean** |  |  [optional]
**firstCommandTimeoutSecs** | **Integer** |  |  [optional]
**voiceUrl** | **String** | URL to which Telnyx will deliver your XML Translator webhooks. | 
**voiceFallbackUrl** | **String** | URL to which Telnyx will deliver your XML Translator webhooks if we get an error response from your voice_url. |  [optional]
**voiceMethod** | [**VoiceMethodEnum**](#VoiceMethodEnum) | HTTP request method Telnyx will use to interact with your XML Translator webhooks. Either &#x27;get&#x27; or &#x27;post&#x27;. |  [optional]
**statusCallback** | **String** | URL for Telnyx to send requests to containing information about call progress events. |  [optional]
**statusCallbackMethod** | [**StatusCallbackMethodEnum**](#StatusCallbackMethodEnum) | HTTP request method Telnyx should use when requesting the status_callback URL. |  [optional]
**inbound** | [**TexmlApplicationInbound**](TexmlApplicationInbound.md) |  |  [optional]
**outbound** | [**TexmlApplicationOutbound**](TexmlApplicationOutbound.md) |  |  [optional]

<a name="VoiceMethodEnum"></a>
## Enum: VoiceMethodEnum
Name | Value
---- | -----
GET | &quot;get&quot;
POST | &quot;post&quot;

<a name="StatusCallbackMethodEnum"></a>
## Enum: StatusCallbackMethodEnum
Name | Value
---- | -----
GET | &quot;get&quot;
POST | &quot;post&quot;
