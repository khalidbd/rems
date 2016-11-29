class BootStrap {

//    def springSecurityService
    def init = { servletContext ->
        def dataGenerator ="""

        def currentDate = new Date();
        def user0 = auth.User.findByUsername('khalid') ?: new auth.User(createdBy: 2L, dateCreated: currentDate, displayName:'Khalid Shifullah', fullName: 'Khalid Shifullah', username: 'khalid', password: '123', enabled: true ).save(flush: true);
        def user1 = auth.User.findByUsername('admin')    ?: new auth.User(createdBy: 2L, dateCreated: currentDate, displayName:'Admin', fullName: 'Administrator', username: 'admin', password: '123', enabled: true    ).save(flush: true);
        def user2 = auth.User.findByUsername('manager')  ?: new auth.User(createdBy: 2L, dateCreated: currentDate, displayName:'Manager', fullName: 'Manager', username: 'manager', password: '123', enabled: true      ).save(flush: true);
        def user3 = auth.User.findByUsername('user')     ?: new auth.User(createdBy: 2L, dateCreated: currentDate, displayName:'User', fullName: 'User', username: 'user', password: '123', enabled: true               ).save(flush: true);

        def role0 = auth.Role.findByAuthority('ROLE_SUPER_ADMIN') ?: new auth.Role(createdBy: user0, dateCreated: currentDate, authority: 'ROLE_SUPER_ADMIN', description: 'Administrator (Auto Generated)').save(flush: true);
        def role1 = auth.Role.findByAuthority('ROLE_ADMIN')       ?: new auth.Role(createdBy: user0, dateCreated: currentDate, authority: 'ROLE_SUPER_ADMIN, ROLE_ADMIN',       description: 'Administrator (Auto Generated)').save(flush: true);
        def role2 = auth.Role.findByAuthority('ROLE_MANAGER')     ?: new auth.Role(createdBy: user0, dateCreated: currentDate, authority: 'ROLE_MANAGER',     description: 'Manager (auto generated)'      ).save(flush: true);
        def role3 = auth.Role.findByAuthority('ROLE_USER')        ?: new auth.Role(createdBy: user0, dateCreated: currentDate, authority: 'ROLE_USER',        description: 'User (auto generated)'         ).save(flush: true);

        def authLkUserRole0 = auth.UserRole.findByUserAndRole(user0, role0) ?: new auth.UserRole(user:user0, role:role0).save(flush: true)
        def authLkUserRole1 = auth.UserRole.findByUserAndRole(user1, role1) ?: new auth.UserRole(user:user1, role:role1).save(flush: true)
        def authLkUserRole2 = auth.UserRole.findByUserAndRole(user2, role2) ?: new auth.UserRole(user:user2, role:role2).save(flush: true)
        def authLkUserRole3 = auth.UserRole.findByUserAndRole(user3, role3) ?: new auth.UserRole(user:user3, role:role3).save(flush: true)

//        def _0000 = new auth.Menu(createdBy: user0, dateCreated: currentDate, isActive: true, sortOrder:5,  parentMenu:  null, title: 'Settings',    url: '/#settings/*'      ).save();
//        def _1000 = new auth.Menu(createdBy: user0, dateCreated: currentDate, isActive: true, sortOrder:5,  parentMenu: _0000, title: 'Menu',        url: '/#menu/*'          ).save();
//        def _2000 = new auth.Menu(createdBy: user0, dateCreated: currentDate, isActive: true, sortOrder:10, parentMenu: _0000, title: 'User',        url: '/#user/*'          ).save();
//        def _3000 = new auth.Menu(createdBy: user0, dateCreated: currentDate, isActive: true, sortOrder:15, parentMenu: _0000, title: 'Role',        url: '/#role/*'          ).save();
//        def _4000 = new auth.Menu(createdBy: user0, dateCreated: currentDate, isActive: true, sortOrder:20, parentMenu: _0000, title: 'Mapping',     url: '/#mapping/*'       ).save();
//        def _1100 = new auth.Menu(createdBy: user0, dateCreated: currentDate, isActive: true, sortOrder:5,  parentMenu: _1000, title: 'List',        url: '/menu/index'       ).save();
//        def _1200 = new auth.Menu(createdBy: user0, dateCreated: currentDate, isActive: true, sortOrder:10, parentMenu: _1000, title: 'Create',      url: '/menu/create'      ).save();
//        def _2100 = new auth.Menu(createdBy: user0, dateCreated: currentDate, isActive: true, sortOrder:5,  parentMenu: _2000, title: 'List',        url: '/user/index'       ).save();
//        def _2200 = new auth.Menu(createdBy: user0, dateCreated: currentDate, isActive: true, sortOrder:10, parentMenu: _2000, title: 'Create',      url: '/user/create'      ).save();
//        def _3100 = new auth.Menu(createdBy: user0, dateCreated: currentDate, isActive: true, sortOrder:5,  parentMenu: _3000, title: 'List',        url: '/role/index'       ).save();
//        def _3200 = new auth.Menu(createdBy: user0, dateCreated: currentDate, isActive: true, sortOrder:10, parentMenu: _3000, title: 'Create',      url: '/role/create'      ).save();
//        def _4100 = new auth.Menu(createdBy: user0, dateCreated: currentDate, isActive: true, sortOrder:5,  parentMenu: _4000, title: 'User & Role', url: '/#userRole'        ).save();
//        def _4200 = new auth.Menu(createdBy: user0, dateCreated: currentDate, isActive: true, sortOrder:10, parentMenu: _4000, title: 'URL & Role',  url: '/#requestMap'      ).save();
//        def _4110 = new auth.Menu(createdBy: user0, dateCreated: currentDate, isActive: true, sortOrder:5,  parentMenu: _4100, title: 'List',        url: '/userRole/index'   ).save();
//        def _4120 = new auth.Menu(createdBy: user0, dateCreated: currentDate, isActive: true, sortOrder:10, parentMenu: _4100, title: 'Create',      url: '/userRole/create'  ).save();
//        def _4210 = new auth.Menu(createdBy: user0, dateCreated: currentDate, isActive: true, sortOrder:5,  parentMenu: _4200, title: 'List',        url: '/requestMap/index' ).save();
//        def _4220 = new auth.Menu(createdBy: user0, dateCreated: currentDate, isActive: true, sortOrder:10, parentMenu: _4200, title: 'Create',      url: '/requestMap/create').save();

//        if (!user.authorities.contains(role)) {
            auth.UserRole.create(user0, role0, true)
            // add some initial request map
            for (String url in [
                '/assets/**', '/resources/**', '/**/favicon.ico',
                '/**/js/**',  '/**/css/**',    '/**/images/**',
                '/login',     '/login.*',      '/login/*',
                '/logout',    '/logout.*',     '/logout/*'
            ]){
                new auth.RequestMap(createdBy: user0, dateCreated: currentDate, url: url, configAttribute: 'permitAll').save(flush: true)
            }
            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'IS_AUTHENTICATED_FULLY', url: '/'                                                   ).save(flush: true);
            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'IS_AUTHENTICATED_FULLY', url: '/index'                                              ).save(flush: true);
            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'IS_AUTHENTICATED_FULLY', url: '/list.gsp'                                           ).save(flush: true);

            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'ROLE_SUPER_ADMIN, ROLE_ADMIN', url: '/user/**',                                     ).save(flush: true);
            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'ROLE_SUPER_ADMIN, ROLE_ADMIN', url: '/role/**',                                     ).save(flush: true);
            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'ROLE_SUPER_ADMIN, ROLE_ADMIN', url: '/userRole/**',                                 ).save(flush: true);
            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'ROLE_SUPER_ADMIN, ROLE_ADMIN', url: '/requestMap/**',                               ).save(flush: true);
//            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'ROLE_SUPER_ADMIN, ROLE_ADMIN', url: '/menu/**',                                     ).save(flush: true);

            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'IS_AUTHENTICATED_FULLY',       url: '/usersProperty/index'                          ).save(flush: true);
            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'IS_AUTHENTICATED_FULLY',       url: '/usersProperty/create'                         ).save(flush: true);
            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'IS_AUTHENTICATED_FULLY',       url: '/usersProperty/save'                           ).save(flush: true);
            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'IS_AUTHENTICATED_FULLY',       url: '/usersProperty/show/**'                        ).save(flush: true);
            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'IS_AUTHENTICATED_FULLY',       url: '/usersProperty/edit/**'                        ).save(flush: true);
            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'ROLE_SUPER_ADMIN, ROLE_ADMIN', url: '/usersProperty/delete/**'                      ).save(flush: true);

            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'ROLE_SUPER_ADMIN, ROLE_ADMIN',                          url: '/#availableController').save(flush: true);
            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'ROLE_SUPER_ADMIN, ROLE_ADMIN, ROLE_MANAGER'           , url: '/dashBoard/**'        ).save(flush: true);
            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'ROLE_SUPER_ADMIN, ROLE_ADMIN, ROLE_MANAGER, ROLE_USER', url: '/user/changePassword' ).save(flush: true);
            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'ROLE_SUPER_ADMIN, ROLE_ADMIN, ROLE_MANAGER, ROLE_USER', url: '/profile/**'          ).save(flush: true);

//            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'ROLE_SUPER_ADMIN',                                      url: '/user/showPassword/*' ).save(flush: true);
//            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'ROLE_SUPER_ADMIN, ROLE_ADMIN',                          url: '/#settings/*'         ).save(flush: true);
//            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'ROLE_SUPER_ADMIN, ROLE_ADMIN',                          url: '/#menu/*'             ).save(flush: true);
//            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'ROLE_SUPER_ADMIN, ROLE_ADMIN',                          url: '/#user/*'             ).save(flush: true);
//            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'ROLE_SUPER_ADMIN, ROLE_ADMIN',                          url: '/#role/*'             ).save(flush: true);
//            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'ROLE_SUPER_ADMIN, ROLE_ADMIN',                          url: '/#mapping/*'          ).save(flush: true);
//            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'ROLE_SUPER_ADMIN, ROLE_ADMIN',                          url: '/#userRole'           ).save(flush: true);
//            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'ROLE_SUPER_ADMIN, ROLE_ADMIN',                          url: '/#requestMap'         ).save(flush: true);
//            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'ROLE_SUPER_ADMIN, ROLE_ADMIN, ROLE_MANAGER',            url: ''                     ).save(flush: true);
//            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'ROLE_SUPER_ADMIN, ROLE_ADMIN, ROLE_MANAGER, ROLE_USER', url: ''                     ).save(flush: true);

//            new auth.RequestMap(createdBy: user0, dateCreated: currentDate, configAttribute: 'ROLE_SWITCH_USER,isFullyAuthenticated()'     , url: '/j_spring_security_switch_user').save(flush: true);
//        }
//        springSecurityService.clearCachedRequestmaps()
//"""
    }
    def destroy = {
    }
}
