/** attach controllers to this module 
 * if you get 'unknown {x}Provider' errors from angular, be sure they are
 * properly referenced in one of the module dependencies in the array.
 * below, you can see we bring in our services and constants modules 
 * which avails each controller of, for example, the `config` constants object.
 *
 * It’s just like top level app.js: it defines a module.
 **/
define(['angular'], function (ng) {
    'use strict';
    return ng.module('app.controllers', []);
});
