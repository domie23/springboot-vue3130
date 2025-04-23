const base = {
    get() {
        return {
            url : "http://localhost:8080/zhuyuanguanli/",
            name: "zhuyuanguanli",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/zhuyuanguanli/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "住院管理系统"
        } 
    }
}
export default base
