Feature: Incident Management

Scenario: Create a new Incident
Given url 'http://dev81827.service-now.com/api/now/table/incident'
And header Authorization = 'Basic YWRtaW46U3JpbmlzdWJ1OTAwNiM='
When request {'short_description' : 'keyboard issue'}
Then method post
And print response