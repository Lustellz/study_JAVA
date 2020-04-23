<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Board Form</title>
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
          crossorigin="anonymous">
    <style>
        /*html{position:relative;min-height:100%;}*/
        body{
            margin-bottom:60px;
        }

        body > .container{
            padding:60px 15px 0;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="page-header">
        <h1>게시글 목록</h1>
    </div>
    <div class="pull-right" style="width:100px;margin:10px 0;">
        <a href="/post" class="btn btn-primary btn-block">등록</a>
    </div>
    <br/><br/><br/>

    <div id="mainHide">
        <table class="table table-hover">
            <thead>
            <tr>
                <th class="col-md-1">#</th>
                <th class="col-md-2">카테고리</th>
                <th class="col-md-5">제목</th>
                <th class="col-md-2">작성날짜</th>
                <th class="col-md-2">수정날짜</th>
            </tr>
            </thead>
            <tbody>
            <tr th:each="post : ${postList}">
                <td th:text="${post.idx}"></td>
                <td th:text="${post.postType.value}"></td>
                <td><a th:href="'/post?idx='+${post.idx}" th:text="${post.title}"></a></td>
                <td th:text="${post.createdDate} ?
                    ${#temporals.format(post.createdDate,'yyyy-MM-dd HH:mm')} : ${post.createdDate}"></td>
                <td th:text="${post.updatedDate} ?
                    ${#temporals.format(post.updatedDate,'yyyy-MM-dd HH:mm')} : ${post.updatedDate}"></td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
<br/>

<nav aria-label="Page navigation" style="text-align:center;">
    <ul class="pagination" th:with="startNumber=${T(Math).floor(postList.number/10)}*10+1,
endNumber=(${postList.totalPages} > ${startNumber}+9) ? ${startNumber}+9 : ${postList.totalPages}">
        <li><a aria-label="Previous" href="/post/list?page=1">&laquo;</a></li>
        <li th:style="${postList.first} ? 'display:none'">
            <a th:href="@{/post/list(page=${postList.number})}">&lsaquo;</a>
        </li>

        <li th:each="page :${#numbers.sequence(startNumber, endNumber)}" th:class="(${page} == ${postList.number}+1) ? 'active'">
            <a th:href="@{/post/list(page=${page})}" th:text="${page}"><span class="sr-only"></span></a>
        </li>

        <li th:style="${postList.last} ? 'display:none'">
            <a th:href="@{/post/list(page=${postList.number}+2)}">&rsaquo;</a>
        </li>
        <li><a aria-label="Next" th:href="@{/post/list(page=${postList.totalPages})}">&raquo;</a></li>
    </ul>
</nav>
</body>
</html>