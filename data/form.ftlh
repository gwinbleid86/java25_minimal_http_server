<#import "layout.ftlh" as main>
<@main.layout>
    <div style="margin-left: 20px;">
        <h1>Redirect sample page</h1>
        <form action="/form" method="post">
            <div class="form-element">
                <label for="user-email">email</label>
                <input type="email" name="email" id="user-email" placeholder="your email" autofocus>
            </div>
            <div class="form-element">
                <label for="user-password">password</label>
                <input type="password" name="user-password" id="user-password" placeholder="your password">
            </div>
            <div class="form-element">
                <button class="register-button" type="submit">Login!</button>
            </div>
        </form>
    </div>
</@main.layout>