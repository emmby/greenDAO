<#ftl strip_whitespace=true><#-- turn off "enable blank link before end of file on save" in your editor -->
<#if schema.isReferenceColumnsByName()>
getColumnIndexForName("${property.columnName}")<#t>
<#else>
offset + ${property_index} /*BOOGA*/<#t>
</#if>