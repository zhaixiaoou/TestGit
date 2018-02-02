# TestGit
练习Git各种提交、回滚

- 新建分支
	- `git branch [branch-name]`
- 分支上传
	- `git push origin [branch-name]`(origin 你的远程库)
- 切换分支
	- `git checkout [branch-name]`
- 删除本地分支
	- `git branch -d [branch-name]` 
- 合并指定分支到当前分支
	- `git merge [branch]` 
	合并分支时，可能发生冲突
	![image](https://raw.githubusercontent.com/zhaixiaoou/MarkdownPhotos/master/res/805E7F32-7FD9-4927-ABE2-645207D9CF87.png)
- 解决冲突
	- `git status`发生冲突时，我们你可以利用`git status`看下状态，可以看出文件存在冲突
		![image](https://raw.githubusercontent.com/zhaixiaoou/MarkdownPhotos/master/res/267431C1-723C-4D9B-95AF-3525F9145811.png)
	这时，我们通过
	- `vim [file-name]` 打开文件
	![image](https://raw.githubusercontent.com/zhaixiaoou/MarkdownPhotos/master/res/D9A73A31-9B5F-40A8-836B-23CCA09A42FA.png)
	- 按字母`i`开始编辑 
	- 按`esc`退出编辑
	- 输入`:wq`保存
	- `git add .`
	- `git commit -m 'message'`
	- `git push`
- `git add`撤销操作
	- `git add .` 将所有改变的文件放入暂存区，

	那么如何取消暂存其中的一个文件呢？其实`git status`命令输出已经告诉我们了
	![image](https://raw.githubusercontent.com/zhaixiaoou/MarkdownPhotos/master/res/4A38F0A0-60D4-4EE4-BB06-F8C0503440A4.png)
	- `git reset HEAD [file-name]` 取消某个文件的暂存
	- `git checkout --<file>..` 取消对文件的修改 (上图中提示信息所示)
- git撤销已经push到远端的commit
	- `git log` 打印出commit的版本号
	![image](https://raw.githubusercontent.com/zhaixiaoou/MarkdownPhotos/master/res/39F7DD21-436F-4782-8F51-CB336B59BFC5.png)
	- `git reset --hard <版本号>`
	- 提交 `git push origin <分支号>` 
	会提示本地版本落后于远端的版本
	![image](https://raw.githubusercontent.com/zhaixiaoou/MarkdownPhotos/master/res/875FFC47-54D2-47AF-899E-093DD0D0A7FD.png)
	为了覆盖远端的版本信息，是远端的仓库也回退到相应的版本，需要加上参数`--force`
	- `git push origin <分支名> --force`
	
	到这，如果没什么问题改结束了，But something always go wrong。
	![image](https://raw.githubusercontent.com/zhaixiaoou/MarkdownPhotos/master/res/081A9FB4-2E5C-43C0-8E57-A2E600B31B4A.png)
	> You are not allowed to force push code to a protected branch on this project.
	
	What!!! master分支是“protected branch”
	![image](https://raw.githubusercontent.com/zhaixiaoou/MarkdownPhotos/master/res/03400067-3EB2-40EA-B3FA-C3D3373B9404.png)
	Project Setting
	![image](https://raw.githubusercontent.com/zhaixiaoou/MarkdownPhotos/master/res/8D4E9208-554C-47BE-AB8F-DF03A8BF0719.png)
	![image](https://raw.githubusercontent.com/zhaixiaoou/MarkdownPhotos/master/res/DDA23FE2-7E4F-4283-94A3-045884034F21.png)
	<b>只需要把该分支`Unprotect`,就可以愉快的玩耍了</b></br>
	<b>撤销完成之后，记得还把该分支受保护哦，毕竟master分支也不是说要回滚就能回滚</b>
- git撤销commit但未push的操作
	- `git log`找到之前提交的git commit的id
	- `git reset --hard id` 想要撤销的id
	- `git reset id` 将代码恢复到该id对应的版本 
	![image](https://raw.githubusercontent.com/zhaixiaoou/MarkdownPhotos/master/res/D4D91350-673C-4D4D-87A7-8A62A3059F94.png)