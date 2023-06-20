job('job2_deploy'){
description('Created from seed job')
triggers {
        upstream('seed_job', 'SUCCESS')
    }

steps {
shell('echo hi Ravinder')
}
}
