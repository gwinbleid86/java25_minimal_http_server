<#import "layout.ftlh" as main>
<@main.layout>
    <div style="margin-left: 20px;">
        <h1>Query parameters sample page</h1>

        <#if params??>
            <ul>
                <#list params as name, value>
                    <li><b>${name}</b> - <span style="background-color: lightgray;">${value}</span></li>
                </#list>
            </ul>
        </#if>
    </div>
</@main.layout>