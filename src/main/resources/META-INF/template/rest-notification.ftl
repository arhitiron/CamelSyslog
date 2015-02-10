<#list body.lists as key>
  ${key}
</#list>

<?xml version="1.0" encoding="UTF-8"?>
<tns:test-suite xmlns:tns="http://restTestFramework.nxc.ch/test/rest" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://restTestFramework.nxc.ch/test/rest ../xsd/rest-unit.v2.xsd">
    <name>REST API test suite</name>
    <description></description>

    <test-case>
        <name>Request to url</name>
        <request>
            <url>url</url>
            <method>GET</method>
        </request>
        <response />
    </test-case>

</tns:test-suite>