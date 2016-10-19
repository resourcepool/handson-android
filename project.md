# Chat project

## Introduction

This project will complete the fist android steps we discovered during the lesson.
The objective is to build an awesome chat to spam your friends. You will be able to send stupid texts, images,
and if you really don't want to miss any message get notifications for new messages.

This project is the opportunity to add some of the libs we discovered, create a clean architecture, and get a taste 
of Android development.

## The Application:
Try it to see the final result: 
[Doawnload the apk](//todo add apk)
//todo add images of the app

## Requirements

The features of the project are divided in several steps: 

### <img src="./images/stormtrooper.png" style="width: 32px;"/> JarJar Binks:
Hello world : Build a simple application with Android Studio, if JarJar can do it, so do you.

### <img src="./images/stormtrooper.png" style="width: 32px;"/> Ewok:
Implement the [chat API 1.0](./server.html).
Use this API to allow the user to create an account and log with it.
Once logged the user is redirect to the main page. This page display a list with all the messages.
For this step only the user name, the date and the message are displayed.
At the bottom of the page the user can send messages.

Implements a pull to refresh on the list to allow the user to retrieved the last messages.

Take some time to respect all the guide lines of [The material design](https://material.google.com/).


### <img src="./images/stormtrooper.png" style="width: 32px;"/> Stormtrooper:
It's time to grow up. Let's upgrade the API and use the [chat API 2.0](./server.html)
You will notice some changes. Indeed this API performs authentication using basic authentication ([more info on basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication))

We saw in the lesson how to implement infinite scroll, so lest's add it to improve the user experience of the app.
Once it's done check how to retrieve pictures, and display them on the messages. [(check the lesson)](./index.html#/9/2)

### <img src="./images/stormtrooper.png" style="width: 32px;"/> Padawan:
The pictures displayed are nice but I am sure you can find some better ones, so allow your user to take and send profile pictures.

### <img src="./images/stormtrooper.png" style="width: 32px;"/> Jedi:
A Jedi must feel the force and know when something happen in the chat. Don't let him pull to refresh every minutes.
Embrace the power of Android notification with the Websockets implemented by the server.
Remember to stack new notifications with the old ones so you don't flood your user.

### <img src="./images/stormtrooper.png" style="width: 32px;"/> Jedi master:
It's time to get your application nice and clean. Improve your app architecture with:
- Retrofit
- Dagger
- RX

If you are still standing, implement Chat heads to complete this awesome chat.


### Bonus:

Use the MVP pattern to provide your improve your maintainability.
An app must have an Easter egg to be completed, use your imagination and surprise me.
The Ui is the identity of your application, check libs and take initiatives to make it beautiful.
Improve the performance and the lisibility with libs as :
- Butterknife
- Glide

Fell free to develop your own features, it's the best way to discover Android.
