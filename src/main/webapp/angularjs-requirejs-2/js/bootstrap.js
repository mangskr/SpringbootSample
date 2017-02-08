/**
 * bootstraps angular onto the window.document node
 * NOTE: the ng-app attribute should not be on the index.html when using ng.bootstrap
 *
 * We’re bootstrapping angular manually now, that’s what bootstrap.js is for. Note that you don’t need ng-app in your html anymore. Also routes.js, which contains angular routes configuration is included into dependencies list.
 *
 * Note that in this require module we almost have no use of asynchronous loading
 * and we’ll always have chain of angular -> app -> routes, as they depend on each other:
 * angular needs to be present on a page before setting up application module,
 * which is required to exist when defining routes config.
 */
define([
    'require',
    'angular',
    'app',
    'routes'
], function (require, ng) {
    'use strict';

    /*
     * place operations that need to initialize prior to app start here
     * using the `run` function on the top-level module
     */

    require(['domReady!'], function (document) {
        ng.bootstrap(document, ['app']);
    });
});
