(function(){
  "use strict";

  const del = require('del');
  const gulp = require('gulp');
  const connect = require('gulp-connect');

  gulp.task('build',['appBuild'],function(){
    gulp.src('node_modules/bootstrap/dist/**/*')
    .pipe(gulp.dest('dist/libs/bootstrap'));

    gulp.src('node_modules/angular/*.js')
    .pipe(gulp.dest('dist/libs/angular'));
  });

  gulp.task('appBuild',function(){
    gulp.src('app/**/*')
    .pipe(gulp.dest('dist'));
  });

  gulp.task('clean',function(){
    del.sync(['dist']);
  });

  gulp.task('run', function() {
    gulp.watch('app/**/*',function(){
      gulp.run('appBuild');
    });
    connect.server({
      root: "dist",
      port: 8000
    });
  });

})();