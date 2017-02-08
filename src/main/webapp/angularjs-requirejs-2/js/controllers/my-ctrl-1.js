/**
 * In the case with the app.controllers module it’ll be controllers.
 * Example of controller wrapped in define is:
 *
 * Note that we used reference to ./module.js to attach component to its module.
 **/
define(['./module'], function (controllers) {
    'use strict';
    controllers.controller('MyCtrl1', [function ($scope) {}]);
});
