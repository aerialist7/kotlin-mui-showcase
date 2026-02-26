// Configure Webpack Dev Server for Matter preview environment
if (config.devServer) {
    config.devServer.host = '0.0.0.0';
    config.devServer.port = 8080;
    config.devServer.allowedHosts = 'all';
}
