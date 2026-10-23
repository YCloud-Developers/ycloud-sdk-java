

# ContactNoteMutationInput

An incremental note mutation for a contact update. When `id` is absent, a new note is created. When `id` is present, the owned note is updated. Notes omitted from the array remain unchanged.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Existing note ID. Omit to create a new note. |  [optional] |
|**content** | **String** | Note content. Leading and trailing whitespace is removed before validation and storage. |  |
