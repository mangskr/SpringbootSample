/**
 * loads sub modules and wraps them up into the main module
 * this should be used for top-level module definitions only
 *
 * app.js wraps the definition of the top-level app module
 * and loads the dependencies of its submodules.
 *
 * We agreed to have 4 modules by files types:
 * controllers, directives, filters, services
 * – we require these modules to be loaded before defining the main module.
 */
define([
    'angular',
    'angular-route',
    './controllers/index',
    './directives/index',
    './filters/index',
    './services/index'
], function (angular) {
    'use strict';

    return angular.module('app', [
        'app.controllers',
        'app.directives',
        'app.filters',
        'app.services',
        'ngRoute'
    ]);
});
