var configuration = {
    'application' : {
        'components' : {

            'logger' : {
                'class' : 'hu.asd'
            },

            'controllerFactory' : {
                'enabled' : true
            },
            'urlManager' : {
                'rules' : {
                    '{controller}/{action}' : '{controller:[a-zA-Z0-9_]*}/{action:[a-zA-Z0-9_]*}'
                }
            }
        }
    }
};
