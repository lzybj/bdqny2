declare
  v_cur_uname varchar2(20);
  v_cur_upwd varchar2(50);
  ---定义游标
  cursor mycur is 
    select uname,upwd from tbl_users where uname = 'oracle';  
begin
   for myuser in mycur loop
      v_cur_uname := myuser.uname;
      v_cur_upwd := myuser.upwd;
      dbms_output.put_line(v_cur_uname || ',' || v_cur_upwd);
   end loop;
end;