declare
  v_cur_uname varchar2(20);
  v_cur_upwd varchar2(50);
  ---定义游标
  cursor mycur is 
    select uname,upwd from tbl_users where uname = 'oracle';
begin
   --打开游标
   open mycur;
   --处理游标
/*   loop
   fetch mycur into v_cur_uname,v_cur_upwd;
   if(mycur%NOTFOUND) then
      exit;
   end if;
   dbms_output.put_line(v_cur_uname || ',' || v_cur_upwd);
   end loop;*/
   fetch mycur into v_cur_uname,v_cur_upwd;
   while(mycur%FOUND) LOOP
   dbms_output.put_line(v_cur_uname || ',' || v_cur_upwd);
   fetch mycur into v_cur_uname,v_cur_upwd;
   END LOOP;
   
   --关闭游标
   close mycur;
end;