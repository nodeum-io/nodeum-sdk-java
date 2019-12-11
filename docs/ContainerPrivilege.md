

# ContainerPrivilege

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional] [readonly]
**name** | **String** |  |  [optional]
**privilege** | [**PrivilegeEnum**](#PrivilegeEnum) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]



## Enum: PrivilegeEnum

Name | Value
---- | -----
NONE | &quot;none&quot;
READ | &quot;read&quot;
READ_WRITE | &quot;read_write&quot;



## Enum: TypeEnum

Name | Value
---- | -----
USER | &quot;user&quot;
GROUP | &quot;group&quot;



