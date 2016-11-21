dataSource {
    pooled = true
    driverClassName = "com.mysql.jdbc.Driver"
    dialect = org.hibernate.dialect.MySQL5UTF8InnoDBDialect
    username = "root"
    password = "root"
}

hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.region.factory_class = 'org.hibernate.cache.ehcache.SingletonEhCacheRegionFactory'
}
environments {
    development {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate'

            url = "jdbc:mysql://localhost/asfaq?useUnicode=true&characterEncoding=utf8"
//              url = "jdbc:mysql://192.168.1.19/dbName?useUnicode=true&characterEncoding=utf8"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://localhost/asfaq?useUnicode=true&characterEncoding=utf8"
//              url = "jdbc:mysql://192.168.1.19/dbName?useUnicode=true&characterEncoding=utf8"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://localhost/asfaq?useUnicode=true&characterEncoding=utf8"
//              url = "jdbc:mysql://192.168.1.19/dbName?useUnicode=true&characterEncoding=utf8"
            pooled = true

            properties {
                maxActive = -1
                minEvictableIdleTimeMillis = 1800000
                timeBetweenEvictionRunsMillis = 1800000
                numTestsPerEvictionRun = 3
                testOnBorrow = true
                testWhileIdle = true
                testOnReturn = true
                validationQuery = "SELECT 1"
            }
        }
    }
}