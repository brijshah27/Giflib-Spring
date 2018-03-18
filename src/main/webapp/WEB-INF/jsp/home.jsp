<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<h2>Categories:</h2>
<a href="category/1">Funny</a>
<a href="category/2">Movie</a>
<a href="category/3">Study</a>
<hr/>
<c:forEach items="${gifs}" var="gif">
<h1><a href="gif/${gif.name}">${gif.name}</a></h1>
<h4>${gif.username}</h4>
<img src="${gif.name}.gif"></img>
<h4>${gif.dateUploaded}</h4>
<hr/>
</c:forEach>
</html>