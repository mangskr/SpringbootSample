/** attach controllers to this module 
 * if you get 'unknown {x}Provider' errors from angular, be sure they are
 * properly referenced in one of the module dependencies in the array.
 * below, you can see we bring in our services and constants modules 
 * which avails each controller of, for example, the `config` constants object.
 *
 * module loader
 * That’s just an empty define block with all module components included.
 * You don’t need to mention module.js here as it’s already required by components.
 * Loader is included as dependency of top level app module.
 * And that’s actually how RequireJS knows about files to load.
 **/
define([
    './my-ctrl-1',
    './my-ctrl-2'
], function () {});
